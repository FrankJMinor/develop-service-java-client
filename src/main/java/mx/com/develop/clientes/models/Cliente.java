package mx.com.develop.clientes.models;

import java.io.Serializable;

public class Cliente implements Serializable{
    private int ID;
    private String NOMBRES;
    private String APEMAT;
    private String APEPAT;
    private int EDAD;
    private String CORREO;
    private int ID_DIRECCION;

    protected Cliente() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public void setAPEMAT(String APEMAT) {
        this.APEMAT = APEMAT;
    }

    public void setAPEPAT(String APEPAT) {
        this.APEPAT = APEPAT;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public void setID_DIRECCION(int ID_DIRECCION) {
        this.ID_DIRECCION = ID_DIRECCION;
    }

    public int getID() {
        return ID;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public String getAPEMAT() {
        return APEMAT;
    }

    public String getAPEPAT() {
        return APEPAT;
    }

    public int getEDAD() {
        return EDAD;
    }

    public String getCORREO() {
        return CORREO;
    }

    public int getID_DIRECCION() {
        return ID_DIRECCION;
    }
}
