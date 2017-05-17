
package edu.orangecoastcollege.capstone.view;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * @author ptang10
 *
 */
public class AddGodScene
{
    @FXML
    private TextField godNameTF;

    @FXML
    private TextField godBaseHealthTF;

    @FXML
    private TextField godBasePhysicalProtectTF;

    @FXML
    private TextField godBaseMagicalProtectTF;

    @FXML
    private TextField godBaseManaTF;

    @FXML
    private TextField godBaseAttackSpeedTF;

    @FXML
    private TextField godBaseHP5TF;

    @FXML
    private TextField godBaseMP5TF;

    @FXML
    private TextField godPhysicalProtectionScaling;

    @FXML
    private TextField godMagicalProtectionScaling;

    @FXML
    private TextField godBaseMovementSpeedTF;

    @FXML
    private TextField godBaseDamageTF;

    @FXML
    private TextField godDamageScalingTF;

    @FXML
    private TextField godPantheonTF;

    @FXML
    private TextArea godLoredTA;

    @FXML
    private ComboBox<String> godClassCB;

    @FXML
    private ComboBox<String> godTypeCB;
}
