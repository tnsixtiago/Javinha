
class weight {
    //Diferença de peso na terra e lua//

    public static void main(String args[]){
        float lua;
        float terra;
        float peso;

        float callua;
        float calnewt;

        // GRAVIDADE LOCAL
        lua = 1.7f; // m/s² //
        terra = 9.81f; // m/s²//

        // PESO DA MATÉRIA
        peso = 63.4f;

        // CALCULO
        callua = peso / terra * lua;
        calnewt = peso * lua;


        //Formato decimal//
        String resultadoFormatado = String.format("%.2f",callua);
        String formatado = String.format("%.2f", calnewt);

        // Resultado em quilogramas //
        System.out.println ("O seu peso na lua é: " + resultadoFormatado + " kg.");

        // Resultado em newtons //
        System.out.println ("O seu peso newtons na lua é: " + formatado + " N.");
    }
}