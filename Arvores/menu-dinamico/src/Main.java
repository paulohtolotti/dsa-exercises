import structures.GenericTree;
import structures.MenuItem;

void main() {

    String[] records1 = {"722,Sistema de contabilidade,,",
            "812,Início,/,722",
            "825,Clientes,,722",
            "831,Cadastro,/clients,825",
            "835,Relatórios,/clients/reports,825",
            "903,Financeiro,,722",
            "912,Resumo,/fin/summary,903",
            "928,Relatórios,/fin/reports,903"};

    String[] records2 = {
            "31,Site de investimentos,,",
            "33,Notícias,,31",
            "47,Nacionais,/noticias-nacionais,33",
            "49,Internacionais,/noticias-internacionais,33",
            "53,Economia,,31",
            "57,Bolsa de valores,,53",
            "61,Ações,/acoes,57",
            "65,Fundos imobiliários,/fii,57",
            "72,Indicadores,/indicadores,53",
            "75,Blog,/blog,53"};

    var tree1 = generateTree(records1);
    var tree2 = generateTree(records2);

    System.out.println(tree1);
    System.out.println(tree2);
}

public static GenericTree<MenuItem> generateTree(String[] records) {
    Map<String, MenuItem> itemsMap = new Hashtable<>();

    GenericTree<MenuItem> tree = new GenericTree<>();



    for(int i = 0; i < records.length; i++) {

        String[] data = records[i].split(",", -1);
        String route = data[2].isBlank() ? null : data[2];
        MenuItem item = new MenuItem(data[1], route);

        if(i == 0) {
            itemsMap.put(data[0], item);
            tree.add(item, null);
            continue;
        }

        MenuItem parent = itemsMap.get(data[3]);
        itemsMap.put(data[0], item);
        tree.add(item, parent);

    }



    return tree;
}