private double base;

   private double altura;

   private double comprimento;

   private double volume;

   

   public void volume(){

   

     base = Double.parseDouble(JOptionPane.showInputDialog("Informe "

             + "a medida da base de uma viga: "));

     altura = Double.parseDouble(JOptionPane.showInputDialog("Informe "

             + "a medida da altura de uma viga: "));  

     comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe "

             + "a medida do comprimento de uma viga: "));

     

     volume = base * altura * comprimento;

     

     JOptionPane.showMessageDialog(null,"O volume calculado: " + volume);

     

   }    

}