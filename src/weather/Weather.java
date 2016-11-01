
package weather;

import java.io.IOException;
import java.net.MalformedURLException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;


public class Weather extends javax.swing.JFrame {
    
   
    public Weather() {
        initComponents();
        
    }
    
    public void getWeather(){  
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cloudIcon = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        humidityLabel = new javax.swing.JLabel();
        visibilityLabel = new javax.swing.JLabel();
        pressureLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        backgroundWeather = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cloudIcon.setText("fgxgxfg");
        getContentPane().add(cloudIcon);
        cloudIcon.setBounds(30, 20, 90, 100);

        statusLabel.setText("mostlycloudy");
        getContentPane().add(statusLabel);
        statusLabel.setBounds(110, 140, 90, 20);

        temperatureLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        temperatureLabel.setText("jLabel1");
        getContentPane().add(temperatureLabel);
        temperatureLabel.setBounds(30, 170, 110, 80);

        speedLabel.setText("jLabel1");
        getContentPane().add(speedLabel);
        speedLabel.setBounds(30, 270, 80, 16);

        humidityLabel.setText("jLabel1");
        getContentPane().add(humidityLabel);
        humidityLabel.setBounds(30, 290, 80, 16);

        visibilityLabel.setText("jLabel1");
        getContentPane().add(visibilityLabel);
        visibilityLabel.setBounds(30, 310, 80, 16);

        pressureLabel.setText("jLabel1");
        getContentPane().add(pressureLabel);
        pressureLabel.setBounds(30, 330, 70, 16);

        cityLabel.setText("jLabel1");
        getContentPane().add(cityLabel);
        cityLabel.setBounds(170, 200, 90, 16);

        backgroundWeather.setIcon(new javax.swing.ImageIcon("C:\\Users\\shiha\\Documents\\NetBeansProjects\\DailyCompanion\\src\\weather\\weatherBackground2.jpg")); // NOI18N
        getContentPane().add(backgroundWeather);
        backgroundWeather.setBounds(0, 0, 650, 409);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) throws IOException,MalformedURLException,JSONException {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather().setVisible(true);
            }
        });
        
       OpenWeatherMap owm = new OpenWeatherMap("bdc2605d641073bc05c91883ee6c6fd5");
    CurrentWeather cwd = owm.currentWeatherByCityName("Dhaka");
        
    System.out.println("City: "+ cwd.getCityName() + cwd.getMainInstance().getMaxTemperature() + cwd.getMainInstance().getMinTemperature());
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundWeather;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cloudIcon;
    private javax.swing.JLabel humidityLabel;
    private javax.swing.JLabel pressureLabel;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel visibilityLabel;
    // End of variables declaration//GEN-END:variables

