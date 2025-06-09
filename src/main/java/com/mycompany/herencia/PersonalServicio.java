package com.mycompany.herencia;

public class PersonalServicio {
    

    private String Gremio;


    public PersonalServicio(String Gremio) {
        super();
        this.Gremio = Gremio;
    }

    public String getGremio() {
        return Gremio;
    }
    public void setGremio(String Gremio) {
        this.Gremio = Gremio;
    }

    public String agregarPersonalServicios() {
        return "Personal de servicios agregado: " + Gremio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGremio: " + Gremio;
    }


}
