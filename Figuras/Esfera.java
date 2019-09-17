


package Figuras;

public class Esfera{
	static float PI = 3.14159f;
	private float radio;
	private float areaSl;
	private float vol;
	public Esfera(){
	}
	
	public Esfera(float radio){
		setradio(radio);
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
	
	public void getEsfera(){
		System.out.println("El radio de la esfera es: " + radio);
	}
	public void setareaSl(){
		this.areaSl = ((4.0f)*PI*radio*radio);
	}
	public void getareaSl(){
		System.out.println("El area superficial de la esfera es: " + areaSl);
	}
	public void setvol(){
		this.vol = ((4/3)*PI*radio*radio*radio);
	}
	public void getvol(){
		System.out.println("El volumen de la esfera es: " + vol);
	}
}
