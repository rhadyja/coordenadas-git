public class Testando {

    /**
     * Teste da lista
     */
    public static void main(String args[]) {
        AreaClicavel sol = new AreaClicavel(574, 226, 869, 519);
        AreaClicavel casa = new AreaClicavel(185, 599, 711, 1032);
        AreaClicavel arvore = new AreaClicavel(837, 627, 1103, 1032);
        AreaClicavel areaClicavel = new AreaClicavel();

        List<AreaClicavel> imagemComAreasClicaveis = new List<AreaClicavel>();

        imagemComAreasClicaveis.inserir(casa);
        imagemComAreasClicaveis.inserir(arvore);
        imagemComAreasClicaveis.inserir(sol);


        System.out.println(areaClicavel.verificarAreaDoClique(imagemComAreasClicaveis, 700, 300));
        imagemComAreasClicaveis.print();

    }
}
