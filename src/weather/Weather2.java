
package weather;

import java.io.IOException;
import java.net.MalformedURLException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;




public class Weather2 extends javax.swing.JFrame {
   
    public Weather2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws IOException,MalformedURLException,JSONException{
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather2().setVisible(true);
            }
        });
        
          OpenWeatherMap owm = new OpenWeatherMap("bdc2605d641073bc05c91883ee6c6fd5");
    CurrentWeather cwd = owm.currentWeatherByCityName("Dhaka");
        
    System.out.println("City: "+ cwd.getCityName() + cwd.getMainInstance().getMaxTemperature() + cwd.getMainInstance().getMinTemperature());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
