package co.edu.uniquindio.poo;
public class Estudiante {
    //Atributos
    private String name;
    private String last_names;
    private String email;
    private String cellphone;
    private String id;
    private byte age;

    //Constructor 
    public Estudiante(String name, String last_names, String email, String cellphone, String id, byte age){
        
        assert name != null && !name.isBlank(): "El nombre debe ser diferente de null";
        assert last_names != null && !last_names.isBlank(): "Los apellidos deben ser diferente de null";
        assert email != null && email.contains("@"): "El correo debe de tener una @"; 
        assert cellphone != null: "El teléfono no puede ser null";
        assert id != null && !id.isBlank(): "El número de identificación debe ser diferente de null";
        assert age > 0: "La edad no puede ser negativa";
        
        this.name = name;
        this.last_names = last_names;
        this.email = email;
        this.cellphone = cellphone;
        this.id = id;
        this.age = age;
    }

    //Los getters son para obtener o devolver un valor previamente instanciado

    public String getName() {
        return name;
    }

    public String getLast_names() {
        return last_names;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    //Los setter son para cambiar valores de las variables

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Estudiante{" + 
        "nombres='" + name + '\''+
        ", apellidos='" + last_names + '\''+
        ", número de identificación'"+ id +'\''+
        ", correo electrónico='" + email + '\''+
        ", teléfono='" + cellphone + '\''+
        ", edad=" + age +
        '}';
    }
}