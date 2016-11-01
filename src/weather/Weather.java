
package weather;

import javax.swing.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.aksingh.owmjapis.AbstractForecast;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.DailyForecast.Forecast;
import net.aksingh.owmjapis.HourlyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;


public class Weather extends javax.swing.JFrame {
    
   
    public Weather() throws IOException,MalformedURLException,JSONException {
        setSize(200, 200);
        initComponents();
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
        CurrentWeather cwd = owm.currentWeatherByCityName("Toronto");
        DailyForecast fore = owm.dailyForecastByCityName("Toronto, CN", Byte.parseByte("5"));
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
        pressureLabel.setText("Air-Pressure: " + String.valueOf(pressure) + "mb");
        
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

        cloudIcon = new javax.swing.JLabel();
        conditionLabel = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        humidityLabel = new javax.swing.JLabel();
        pressureLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        backgroundWeather = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cloudIcon.setForeground(new java.awt.Color(255, 255, 255));
        cloudIcon.setText("jLabel1");
        getContentPane().add(cloudIcon);
        cloudIcon.setBounds(0, 30, 100, 90);

        conditionLabel.setForeground(new java.awt.Color(255, 255, 255));
        conditionLabel.setText("jLabel1");
        getContentPane().add(conditionLabel);
        conditionLabel.setBounds(110, 130, 90, 16);

        temperatureLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        temperatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        temperatureLabel.setText("jLabel1");
        getContentPane().add(temperatureLabel);
        temperatureLabel.setBounds(30, 150, 90, 80);

        speedLabel.setForeground(new java.awt.Color(255, 255, 255));
        speedLabel.setText("jLabel1");
        getContentPane().add(speedLabel);
        speedLabel.setBounds(30, 250, 130, 16);

        humidityLabel.setForeground(new java.awt.Color(255, 255, 255));
        humidityLabel.setText("jLabel1");
        getContentPane().add(humidityLabel);
        humidityLabel.setBounds(170, 250, 110, 16);

        pressureLabel.setForeground(new java.awt.Color(255, 255, 255));
        pressureLabel.setText("jLabel1");
        getContentPane().add(pressureLabel);
        pressureLabel.setBounds(30, 290, 150, 16);

        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("jLabel1");
        getContentPane().add(cityLabel);
        cityLabel.setBounds(140, 70, 120, 16);

        backgroundWeather.setIcon(new javax.swing.ImageIcon("C:\\Users\\shiha\\Documents\\NetBeansProjects\\DailyCompanion\\src\\weather\\weatherBackground2.jpg")); // NOI18N
        getContentPane().add(backgroundWeather);
        backgroundWeather.setBounds(0, 0, 650, 409);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) throws IOException,MalformedURLException,JSONException {
       // float humidity;
        //String city;
       // String pressure;
       // String windSpeed;
       // int percentageCloud;
       // Weather ob = new Weather();
       // ob.setVisible(true);
        //ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Weather().setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSONException ex) {
                    Logger.getLogger(Weather.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundWeather;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cloudIcon;
    private javax.swing.JLabel conditionLabel;
    private javax.swing.JLabel humidityLabel;
    private javax.swing.JLabel pressureLabel;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel temperatureLabel;
    // End of variables declaration//GEN-END:variables
}
