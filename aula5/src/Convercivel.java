package respDois;
 class convercivel extends CarroSport {
    public void fazCoisas(){
        CarroSport cs = new CarroSport();
        cs.vaiRapido();
    }
    public void fazMais(){
        vaiRapido();
    }
}
