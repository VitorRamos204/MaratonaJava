package academy.devdojo.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void checkPermission() {
        System.out.println("Checando permissao para o banco de dados");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }
    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados.");
    }


}
