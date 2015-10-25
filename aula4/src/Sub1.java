package atividade;
final class Sub1 extends Super {
    public String voar(){
        return "voar e usar o raio " +
                            super.raio() +
                            " ao mesmo tempo";
    }
}
