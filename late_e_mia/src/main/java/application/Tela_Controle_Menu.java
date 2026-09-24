package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Tela_Controle_Menu {

    @FXML
    private ImageView imagelateemia;

    @FXML
    private TextField txtpesquisa;

    @FXML
    private ComboBox<String> cmbClientePet;

    @FXML
    private TextField txtServicoSelecionado;

    @FXML
    private DatePicker datePickerAgendamento;

    @FXML
    private ComboBox<String> cmbHorario;

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnAbrirCadastro;

   
    @FXML private Button btnBanhoTosa;
    @FXML private Button btnTosaHigienica;
    @FXML private Button btnCorteUnhas;
    @FXML private Button btnEscovacaoDentes;
    @FXML private Button btnConsultaVet;
    @FXML private Button btnVacinacao;
    @FXML private Button btnHotelzinho;

   
    private boolean selBanhoTosa = false;
    private boolean selTosaHigienica = false;
    private boolean selCorteUnhas = false;
    private boolean selEscovacaoDentes = false;
    private boolean selConsultaVet = false;
    private boolean selVacinacao = false;
    private boolean selHotelzinho = false;

    @FXML
    private void initialize() {
        System.out.println("Tela de menu e agendamento carregada com sucesso! ");
        
       
        btnAbrirCadastro.setOnAction(event -> {
            try {
                javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("telacadastrocliente.fxml"));
                javafx.scene.Parent root = loader.load();
                
               
                javafx.stage.Stage stage = (javafx.stage.Stage) btnAbrirCadastro.getScene().getWindow();
                stage.setScene(new javafx.scene.Scene(root));
                stage.setTitle("Cadastro de Cliente e Pet");
                stage.setResizable(false);
                stage.show();
                
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro ao abrir a tela de cadastro de cliente.");
            }
        });

       
        btnBanhoTosa.setOnAction(event -> {
            selBanhoTosa = !selBanhoTosa;
            if (selBanhoTosa) {
                btnBanhoTosa.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnBanhoTosa.setText("Selecionado ✓");
            } else {
                btnBanhoTosa.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnBanhoTosa.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

      
        btnTosaHigienica.setOnAction(event -> {
            selTosaHigienica = !selTosaHigienica;
            if (selTosaHigienica) {
                btnTosaHigienica.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnTosaHigienica.setText("Selecionado ✓");
            } else {
                btnTosaHigienica.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnTosaHigienica.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

       
        btnCorteUnhas.setOnAction(event -> {
            selCorteUnhas = !selCorteUnhas;
            if (selCorteUnhas) {
                btnCorteUnhas.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnCorteUnhas.setText("Selecionado ✓");
            } else {
                btnCorteUnhas.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnCorteUnhas.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

       
        btnEscovacaoDentes.setOnAction(event -> {
            selEscovacaoDentes = !selEscovacaoDentes;
            if (selEscovacaoDentes) {
                btnEscovacaoDentes.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnEscovacaoDentes.setText("Selecionado ✓");
            } else {
                btnEscovacaoDentes.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnEscovacaoDentes.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

        
        btnConsultaVet.setOnAction(event -> {
            selConsultaVet = !selConsultaVet;
            if (selConsultaVet) {
                btnConsultaVet.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnConsultaVet.setText("Selecionado ✓");
            } else {
                btnConsultaVet.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnConsultaVet.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

       
        btnVacinacao.setOnAction(event -> {
            selVacinacao = !selVacinacao;
            if (selVacinacao) {
                btnVacinacao.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnVacinacao.setText("Selecionado ✓");
            } else {
                btnVacinacao.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnVacinacao.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

        
        btnHotelzinho.setOnAction(event -> {
            selHotelzinho = !selHotelzinho;
            if (selHotelzinho) {
                btnHotelzinho.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-background-radius: 6; -fx-cursor: hand;");
                btnHotelzinho.setText("Selecionado ✓");
            } else {
                btnHotelzinho.setStyle("-fx-background-color: #F8E2CB; -fx-text-fill: #333333; -fx-background-radius: 6; -fx-cursor: hand;");
                btnHotelzinho.setText("Selecionar");
            }
            atualizarResumoEServicos();
        });

        btnConfirmar.setOnAction(event -> {
            System.out.println("Agendamento confirmado para: " + txtServicoSelecionado.getText());
        });
    }

   
    private void atualizarResumoEServicos() {
        StringBuilder resumo = new StringBuilder();
        boolean exigeHorarioAte17 = false; 

        if (selBanhoTosa) {
            resumo.append("Banho e Tosa (R$ 70,00); ");
            exigeHorarioAte17 = true;
        }
        if (selTosaHigienica) {
            resumo.append("Tosa Higiênica (R$ 45,00); ");
            exigeHorarioAte17 = true;
        }
        if (selCorteUnhas) {
            resumo.append("Corte de Unhas (R$ 25,00); ");
        }
        if (selEscovacaoDentes) {
            resumo.append("Escovação de Dentes (R$ 30,00); ");
        }
        if (selConsultaVet) {
            resumo.append("Consulta Veterinária (R$ 120,00); ");
        }
        if (selVacinacao) {
            resumo.append("Vacinação (R$ 90,00); ");
        }
        if (selHotelzinho) {
            resumo.append("Hotelzinho (R$ 80,00/dia); ");
        }

       
        txtServicoSelecionado.setText(resumo.toString());

       
        if (exigeHorarioAte17) {
            cmbHorario.getItems().setAll(
                "08:00", "08:40", "09:20", "10:00", "10:40", "11:20",
                "14:00", "14:40", "15:20", "16:00", "16:40"
            );
        } else if (!resumo.toString().isEmpty()) {
            cmbHorario.getItems().setAll(
                "08:00", "08:40", "09:20", "10:00", "10:40", "11:20",
                "14:00", "14:40", "15:20", "16:00", "16:40", "17:20", "18:00", "18:40"
            );
        } else {
            cmbHorario.getItems().clear();
        }
    }
}