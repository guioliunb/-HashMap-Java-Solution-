
public class Sorvete {

    TipoSorvete tipo;
    String sabor;

    public void degustar() {
        if(this.tipo == TipoSorvete.CONE)
            System.out.println("Este sorvete de massa no CONE é do sabor de "+this.sabor);
        else if(this.tipo == TipoSorvete.COPO )
            System.out.println("Este sorvete de massa no COPO é do sabor de "+this.sabor);
        else{
            System.out.println("Esse sorvete de palito é do sabor de "+this.sabor);
        }

    }

}
