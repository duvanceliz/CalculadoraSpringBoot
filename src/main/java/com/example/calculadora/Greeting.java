package com.example.calculadora;

public class Greeting {
	
	private float num1;
	private float num2;
	private float res;
	private int operador;
	
	
	public static float suma(float a, float b) {
		
		return a + b;
	}
	
    public static float resta(float a, float b) {
		
		return a - b;
	}
	
    public static float mult(float a, float b) {
		
  		return a * b;
  	}
    public static float div(float a, float b) {
		
  		return a / b;
  	}

	
	
	public int getOperador() {
		
        return operador;
 
       }
	public void setOperador(int operador) {
		 
        this.operador = operador;
    }

		
	public float getRes() {
		
		if( operador == 1) {
			
			 res = suma(num1,num2);
	
			
		} else if(operador == 2 ) {
			
			res = resta(num1,num2);
			
		}else if(operador == 3 ) {
			
			res = mult(num1,num2);
		}else if(operador == 4 ) {
			
			res = div(num1,num2);
		} else {
			
			res = 0;
		}
		 
		
        return res;
     
       }
	
	  
	   public float getNum1() {
		  
        return num1;

       }
	   public float getNum2() {
			 
		return num2;
	 
	    }
	 
	    
	   public void setNum1(float num1) {
		   
	        this.num1 = num1;
	      
	    }
	 
	
	    public void setNum2(float num2) {
	 
	        this.num2 = num2;

	    }
	  
	    

}