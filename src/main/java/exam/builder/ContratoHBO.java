package exam.builder;

import java.util.ArrayList;
import java.util.List;

public class ContratoHBO extends ContratoBuilder{
    @Override
    public void buildCosto() {

        contrato.setCosto(100);

    }

    @Override
    public void buildEmpresa() {

        contrato.setEmpresa("hbo");

    }

    @Override
    public void buildCanales() {

        List<String> canales = new ArrayList<>();

        canales.add("Sonic 1");
        canales.add("IronMan");

        contrato.setListaDeCanales(canales);

    }
}
