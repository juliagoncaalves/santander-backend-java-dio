public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone 14 Pro");

        iphone.mostrarModelo();

        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();

        iphone.ligar("11999998888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
