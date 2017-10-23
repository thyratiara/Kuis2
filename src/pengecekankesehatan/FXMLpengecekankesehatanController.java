/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengecekankesehatan;

import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLpengecekankesehatanController implements Initializable {

    @FXML
    private RadioButton rdLaki;

    @FXML
    private RadioButton rdPerempuan;

    @FXML
    private Button buttonProses;

    @FXML
    private Button buttonReset;
    
    

    @FXML
    private TextArea saran;

    @FXML
    private TextArea hasil;

    @FXML
    private TextField beratIdeal;

    @FXML
    private JFXTextField editnama;

    @FXML
    private JFXTextField edittinggi;

    @FXML
    private JFXTextField editberat;

    @FXML
    void hapus(ActionEvent event) {
        editnama.setText("");
        edittinggi.setText("");
        editberat.setText("");
        rdLaki.setSelected(false);
        rdPerempuan.setSelected(false);
        saran.setText("");
        hasil.setText("");
    }

    @FXML
    void proses(ActionEvent event) {
        
        int berat_ideal = 0;
        String ha = null;
        String sa = null;
        
        if(rdLaki.isSelected()){
        berat_ideal = parseInt(edittinggi.getText()) - 105;
        }
        if(rdPerempuan.isSelected()){
        berat_ideal = parseInt(edittinggi.getText()) - 110;
        }
        
    
    beratIdeal.setText(""+berat_ideal);
    
    if (parseInt (editberat.getText()) == parseInt(edittinggi.getText())){
       ha ="nama"+editnama.getText()+"Tinggi"+edittinggi.getText()+"Ideal";
       sa = "berat badan anda sudah ideal\njaga berat dan makan anda";
       
    }else if (parseInt (editberat.getText()) > parseInt(edittinggi.getText())){
       ha ="nama"+editnama.getText()+"Tinggi"+edittinggi.getText()+"OverWeight";
       sa = "berat badan anda sudah overweight\nkurangi makan anda";
       
    }else if (parseInt (editberat.getText()) < parseInt(edittinggi.getText())){
       ha ="nama"+editnama.getText()+"Tinggi"+edittinggi.getText()+"UnderWeight";
       sa = "berat badan anda underweight \ntambahi berat dan makan anda";
    }
    hasil.setText("Nama"+editnama.getText()+", Anda"+ha);
    saran.setText(sa);
    }
 
   

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
