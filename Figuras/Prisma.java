

package Figuras;

public class Prisma{
		private float ancho;
		private float largo;
		private float altura;
		private float areaSl;
		private float vol;
	public Prisma(){
	}

	public float getancho(){
		return ancho;
	}
	public void setancho(float ancho){
		if(ancho > 0){
		this.ancho = ancho;
		}else{
		System.out.println("No se puede trabajar con numeros negativos o con cero");
		}
	}
	public float getlargo(){
                return largo;
        }
        public void setlargo(float largo){
                if(largo > 0){
                this.largo = largo;
                }else{
                System.out.println("No se puede trabajar con numeros negativos o con cero");
                }
        }
	   public float getaltura(){
                return altura;
        }
        public void setaltura(float altura){
                if(altura > 0){
                this.altura = altura;
                }else{
                System.out.println("No se puede trabajar con numeros negativos o con cero");
                }
        }
	public Prisma(float ancho, float largo, float altura){
		setancho(ancho);
		setlargo(largo);
		setaltura(altura);

	}
	 public void getPrisma(){
                System.out.println("La altura del prisma es: " + altura);
                System.out.println("El ancho del primsa es: " + ancho);
                System.out.println("El largo del prisma es: " + largo);

        }
	public void setareaSl(){
		this.areaSl = (altura*largo*(2.0f))+(altura*ancho*(2.0f))+(ancho*largo*(2.0f));
	}
	public void getareaSl(){
		System.out.println("El area superficial del prisma es: " + areaSl);
	}
	public void setvol(){
		this.vol = (ancho*largo*altura);
	}
	public void  getvol(){
		System.out.println("El volumen del prisma es: " + vol);
	}
}
