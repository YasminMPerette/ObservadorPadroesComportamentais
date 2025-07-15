package observe;

class Usuario implements Observer {

    String nome;


    public Usuario(String msg){
        System.out.println(this.nome + " recebeu " + msg);
    }

    @Override
    public void update(String msg) {
        System.out.println( "Recebido: " + msg);
    }
}
