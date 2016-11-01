
package gui;

import news.RSS;
import database.Data;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.plaf.basic.*;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import news.News;
import org.json.JSONException;
import tasks.Task;

public class Main extends javax.swing.JFrame {
    public String http = "http://www.thedailystar.net/top-news/rss.xml";
    static Data db;
    ListModel taskList;
    ArrayList<News> news;

    /**
     * Creates new form Main
     */
    
    private void fetchRSS(){
        try{
            
           // news = RSS.readRSS("http://www.thedailystar.net/top-news/rss.xml");
            news = RSS.readRSS(http);
            DefaultListModel listModel = new DefaultListModel();
            for(News item : news){
                listModel.addElement("<html><h3>" + item.getTitle()+"</h3></br>" + item.getDescription()+ "</html>");
            }
            rss_JList.setModel(listModel);
        }
        catch(Exception e){
            e.printStackTrace();
            DefaultListModel listModel = new DefaultListModel();
            listModel.addElement("<html><h3>No Network Connetion</h3></html>");
            
            rss_JList.setModel(listModel);
        }
    }
    public static void openWebpage(String uri_str) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                URI uri = new URI(uri_str);
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void openWebpage(URL url) {
        try {
            openWebpage(url.toURI().toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    public Main() throws IOException, JSONException{
      
        initComponents();
        rss_JList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint());
                    openWebpage(news.get(index).getLink());
                }
            }
        });
        task_JList.setCellRenderer(new SingleTask());
        fetchRSS();
        getWeather();
    }
    
     public void getWeather() throws IOException,MalformedURLException,JSONException{  
        float humidity;
        float pressure;
        String city;
        float windSpeed;
        float percentageCloud;
        boolean rain;
        int temperature;
        float divident = 0.555f; 
        String degree = "" + (char)176;
        
        OpenWeatherMap owm = new OpenWeatherMap("bdc2605d641073bc05c91883ee6c6fd5");
        CurrentWeather cwd = owm.currentWeatherByCityName(ChangeCity.cityName);
        DailyForecast fore = owm.dailyForecastByCityName(ChangeCity.cityName, Byte.parseByte("5"));
        DailyForecast.Forecast fo = fore.getForecastInstance(WIDTH);
        Icon iconRain = new ImageIcon("C:\\Users\\shiha\\Documents\\NetBeansProjects\\DailyCompanion\\rainy.png");
        Icon iconSunny = new ImageIcon("C:\\Users\\shiha\\Documents\\NetBeansProjects\\DailyCompanion\\sunny.png");
        Icon iconCloudy = new ImageIcon("C:\\Users\\shiha\\Documents\\NetBeansProjects\\DailyCompanion\\cloudy.png");
        Icon iconOvercast = new ImageIcon("C:\\Users\\shiha\\Documents\\NetBeansProjects\\DailyCompanion\\overcast.png");
        
        humidity = cwd.getMainInstance().getHumidity();
        pressure = cwd.getMainInstance().getPressure();
        city = cwd.getCityName();
        windSpeed = fo.getWindSpeed();
        percentageCloud = fo.getPercentageOfClouds();
        rain = fo.hasRain();
        temperature = (int)cwd.getMainInstance().getTemperature();
        temperature = (int)(((temperature-32)* divident)+1);
        
        
        cityLabel.setText(city);
        temperatureLabel.setText(String.valueOf(temperature) + degree + "C");
        speedLabel.setText("Wind: " + String.valueOf(windSpeed) + "km/h");
        humidityLabel.setText("Humidity: " +String.valueOf(humidity) + "%");
       // pressureLabel.setText("Air-Pressure: " + String.valueOf(pressure) + "mb");
        
        if(fo.hasRain()){
            cloudIcon.setIcon(iconRain);
            conditionLabel.setText("Rainy");
        }
        else{
            if(percentageCloud < 10){
                cloudIcon.setIcon(iconSunny);
                conditionLabel.setText("Sunny");
            }
            else if(percentageCloud >= 10 && percentageCloud < 50){
                cloudIcon.setIcon(iconCloudy);
                conditionLabel.setText("Mostly Cloudy");
            }
            else{
                cloudIcon.setIcon(iconOvercast);
                conditionLabel.setText("Overcast");
            }
        }
     //  System.out.println(pressure + " " + percentageCloud + " " + city + " " + windSpeed + " " + humidity + " " + temperature + degree );
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        task_JList = new javax.swing.JList();
        newTask = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cloudIcon = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        conditionLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        humidityLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rss_JList = new javax.swing.JList();
        reload_rss = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        settingsItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        dailyStar = new javax.swing.JRadioButtonMenuItem();
        independent = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        task_JList.setModel(new javax.swing.AbstractListModel() {
            Task[] strings = { new Task("Item 1","")};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(task_JList);

        newTask.setText("New Task");
        newTask.setToolTipText("Create new task");
        newTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newTaskMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(newTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTask)
                .addContainerGap())
        );

        newTask.getAccessibleContext().setAccessibleName("New Task\n");

        jPanel3.setLayout(null);

        cloudIcon.setText("jLabel1");
        jPanel3.add(cloudIcon);
        cloudIcon.setBounds(0, 0, 130, 110);

        cityLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("jLabel1");
        jPanel3.add(cityLabel);
        cityLabel.setBounds(210, 10, 150, 50);

        temperatureLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        temperatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        temperatureLabel.setText("jLabel1");
        jPanel3.add(temperatureLabel);
        temperatureLabel.setBounds(50, 90, 90, 80);

        conditionLabel.setForeground(new java.awt.Color(255, 255, 255));
        conditionLabel.setText("jLabel1");
        jPanel3.add(conditionLabel);
        conditionLabel.setBounds(90, 90, 80, 16);

        speedLabel.setForeground(new java.awt.Color(255, 255, 255));
        speedLabel.setText("jLabel1");
        jPanel3.add(speedLabel);
        speedLabel.setBounds(210, 90, 140, 16);

        humidityLabel.setForeground(new java.awt.Color(255, 255, 255));
        humidityLabel.setText("jLabel1");
        jPanel3.add(humidityLabel);
        humidityLabel.setBounds(210, 120, 120, 16);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weather/weatherBackground2.jpg"))); // NOI18N
        backgroundLabel.setText("jLabel2");
        jPanel3.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 420, 200);

        rss_JList.setBackground(new java.awt.Color(254, 254, 254));
        rss_JList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        rss_JList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        rss_JList.setFixedCellWidth(135);
        jScrollPane2.setViewportView(rss_JList);

        reload_rss.setText("Reload");
        reload_rss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reload_rssMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reload_rss, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(reload_rss)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Settings");

        settingsItem.setText("Change City");
        settingsItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsItemMouseClicked(evt);
            }
        });
        settingsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsItemActionPerformed(evt);
            }
        });
        jMenu2.add(settingsItem);

        jMenu3.setText("Change News Source");

        bg1.add(dailyStar);
        dailyStar.setSelected(true);
        dailyStar.setText("The Daily Star");
        jMenu3.add(dailyStar);

        bg1.add(independent);
        independent.setText("The Independent UK");
        independent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                independentItemStateChanged(evt);
            }
        });
        jMenu3.add(independent);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reload_rssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reload_rssMouseClicked
        // TODO add your handling code here:
        fetchRSS();
    }//GEN-LAST:event_reload_rssMouseClicked

    private void newTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newTaskMouseClicked
        AddTask newTask = new AddTask();
        
    }//GEN-LAST:event_newTaskMouseClicked

    private void settingsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsItemActionPerformed

    private void settingsItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsItemMouseClicked
        ChangeCity input = new ChangeCity();
    }//GEN-LAST:event_settingsItemMouseClicked

    private void independentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_independentItemStateChanged
        http = "http://www.independent.co.uk/news/uk/rss";
    }//GEN-LAST:event_independentItemStateChanged

 
    public static void main(String args[]) throws IOException, JSONException,MalformedURLException{
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSONException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    db = new Data();
                    db.connect();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
//      NewTask task = new NewTask();
//      task.setVisible(true);
//      task.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
    }

    @Override
    protected void finalize() throws Throwable {
        db.close();
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cloudIcon;
    private javax.swing.JLabel conditionLabel;
    private javax.swing.JRadioButtonMenuItem dailyStar;
    private javax.swing.JLabel humidityLabel;
    private javax.swing.JRadioButtonMenuItem independent;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newTask;
    private javax.swing.JButton reload_rss;
    private javax.swing.JList rss_JList;
    private javax.swing.JMenuItem settingsItem;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JList task_JList;
    private javax.swing.JLabel temperatureLabel;
    // End of variables declaration//GEN-END:variables
}
