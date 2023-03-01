package controller;



public class controller {
	public controller() {
		super();
		}
    public int somatorio(int num) {
    if (num < 0) {
		return 0;
		//condição de parada foi definida caso o num for menor que 0/

    }
    else {
        return	num + somatorio(num -1);
        //Caso o num for maior que zero, fazer o num + somatorio e fazer num - 1 /
    }

    
}
}