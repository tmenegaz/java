package fabrica;
class Carro extends Veiculo {
    //Veiculo novoCarro = new Veiculo();
    /* não é possível criar um objeto de uma
    classe abstract. A classe Veiculo é
    abstract e, portanto, não pod ser
    instanciada e deverá ser extendida
    por meio da palavra reservada extends.
    Para além disso, é preciso implementar
    seus métodos abstratos reescrevendo-os
    sem a palavra abstract e substituido o
    ";" por "{}"
    */    
    public void vaiRapido(){}
    public void transportaCarga(){}
}

