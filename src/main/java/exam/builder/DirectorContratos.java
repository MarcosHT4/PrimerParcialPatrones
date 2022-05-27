package exam.builder;

public class DirectorContratos {

    private ContratoBuilder contratoBuilder;

    public Contrato getContratoFromBuilder() {

        return contratoBuilder.getContrato();

    }

    public void setContratoBuilder(ContratoBuilder contratoBuilder) {

        this.contratoBuilder = contratoBuilder;

    }

    public void buidContrato() {

        contratoBuilder.createContrato();
        contratoBuilder.buildCanales();
        contratoBuilder.buildCosto();
        contratoBuilder.buildEmpresa();

    }



}
