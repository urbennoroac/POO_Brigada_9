

package Figuras;

public class Cono{
	static float PI = 3.14159f;
	private float lateral;
	private float radio;
	private float altura;
	private float areaSl;
	private float vol;

	public Cono(){
	}
	
	public Cono(float lateral, float altura, float radio){
	setlateral(lateral);
	setaltura(altura);
	setradio(radio);
	}

	public void setlateral(float lateral){
	if(lateral > 0){
	this.lateral = lateral;
	}else{
	System.out.println("No se puede trabajar con numeros negativos o cero");
	}
	}

	public float getlateral(){
		return lateral;
	}

	public void setradio(float radio){
        if(radio > 0){
        this.radio = radio;
        }else{
        System.out.println("No se puede trabajar con numeros negativos o cero");
        }
        }

        public float getradio(){
                return radio;
        }

	 public void setaltura(float altura){
        if(altura > 0){
        this.altura = altura;
        }else{
        System.out.println("No se puede trabajar con numeros negativos o cero");
        }
        }

        public float getaltura(){
                return altura;
        }
	
	public void getCono(){
		System.out.println("La altura del cono es: " + altura);
		System.out.println("El radio  del cono es: " + radio);
		System.out.println("La altura lateral  del cono es: " + lateral);
	
	}

	public void setareaSl(){
		this.areaSl = ((PI*radio*lateral)+(PI*radio*radio));
	
	}
	public void getareaSl(){
		System.out.println("El Area Superficial del cono es:" + areaSl);
	}
	
	public void setvol(){
		this.vol = ((1/3)*radio*radio*PI*altura);
	}

	public void getvol(){
		 System.out.println("El Volumen del cono es:" + vol);
	}

}
	
	
