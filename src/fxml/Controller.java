package fxml;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextArea txtAddress;
    public Text fullName;
    public Text email;
    public Text age;
    public Text address;

    public void handleSubmit(){
//        System.out.println("hello ba gia !!!");
        String fn = txtFullName.getText();
        fullName.setText(fn);
        String e = txtEmail.getText();
        email.setText(e);
        String a = txtAge.getText();
        age.setText(a);
        String ad = txtAddress.getText();
        address.setText(ad);
    }
}
