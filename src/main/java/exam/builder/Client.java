package exam.builder;

public class Client {

    public static void main(String[] args) {

        DirectorContratos directorContratos = new DirectorContratos();

        ContratoAMAZON contratoAMAZON = new ContratoAMAZON();
        ContratoHBO contratoHBO = new ContratoHBO();
        ContratoNETFLIX contratoNETFLIX = new ContratoNETFLIX();

        directorContratos.setContratoBuilder(contratoHBO);
        directorContratos.buidContrato();

        Contrato contrato1 = directorContratos.getContratoFromBuilder();

        directorContratos.setContratoBuilder(contratoNETFLIX);
        directorContratos.buidContrato();

        Contrato contrato2 = directorContratos.getContratoFromBuilder();

        directorContratos.setContratoBuilder(contratoAMAZON);
        directorContratos.buidContrato();

        Contrato contrato3 = directorContratos.getContratoFromBuilder();

        contrato1.showInfo();
        contrato2.showInfo();
        contrato3.showInfo();


    }

}
