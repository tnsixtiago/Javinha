class pole {
    public static void main(String args[]){
        float polegadas, metros;
        int counter;

        counter = 0;
        for(polegadas = 1; polegadas <= 165; polegadas++) {
            metros = polegadas / 39.37f;

            String formatado = String.format("%.3f", metros);
            System.out.println(polegadas + " polegadas é igual à: " + formatado + " metros.");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

// 1 polegada = 0,0254
// 1 metro = 39,37 polegadas