package qmp;

import java.util.Objects;
import java.util.*;

public class qmp {
	
	
 static void main(String args[]) {
	
		}
}

class ObtenerCondicionesClimaticas{
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);


Int getTemperatura(){
 return condicionesClimaticas.get(0).get("Temperature").getValue().(...);
}

}

public class Atuendo{
    
  
    Prenda prendasSuperior
    Prenda prendasInferior
    Prenda calzado
    Prenda accesorio
    
  

    Atuendo(Prenda prendasSuperior,  Prenda prendasInferior,Prenda calzado, Prenda accesorio){
        this.prendasSuperior=prendasSuperior
        this.prendasInferior=prendasInferior
        this.calzado=calzado
        this.accesorio=accesorio

    }

    Atuendo darSugerencia(TiposPrendaValidos prendasValidas){
        Prenda partInf = prendasValidas.obtenerParteInferiorSegunTemperatura(temperatura)
        Prenda partSup = prendasValidas.obtenerParteSuperiorSegunTemperatura(temperatura)
        Prenda calzado = prendasValidas.obtenerCalzadoSegunTemperatura(temperatura)
        Prenda accesorio = prendasValidas.obtenerAccesorioSegunTemperatura(temperatura)
        return Atuendo(partInf,partSup,calzado,accesorio);
    }




}




class Prenda{
	TipoPrenda tipoPrenda;
	Material material;
	Color colorSecundario;
	
	Prenda(TipoPrenda tipoPrenda,Material material) {
		this.tipoPrenda=Objects.requireNonNull(tipoPrenda);
		this.material=Objects.requireNonNull(material);
		/*this.colorPrincipal=Objects.requireNonNull(colorPrincipal);
		this.trama=Objects.requireNonNull(trama);
		*/


        void agregarColorSecundario(Color color){
            this.colorSecundario=color;
        }
         
         public String queCategoriaEs(TipoPrenda tipoPrenda, TiposPrendaValidos prendasValidas) {
             return prendasValidas.NombreCategoriaSegun(tipoPrenda);
         }-
		
	}
	
	class Borrador{
		TipoPrenda tipoPrenda;
		Material material;
		Color colorSecundario;
		
		void insertarTipoPrenda(TipoPrenda tipoPrenda) {
			this.tipoPrenda=tipoPrenda;
		}
		
		void insertarTipoMaterial(TipoMaterial tipoMaterial) {
			material.insertarTipo(tipoMaterial);
		}
		void insertarTrama(Trama trama) {
			material.insertarTrama(trama);
		}
		void insertarColor(Color color) {
			material.insertarColor(color);
		}
		void insertarColorSecundario(Color colorSecundario) {
			this.colorSecundario=colorSecundario;
		}
		
	
		
		
		
		
		
	}
	
	

	
}

class Material{
	TipoMaterial tipo;
	Color color;
	Trama trama;
	Material(TipoMaterial tipo,Color color,Trama trama){
		if ((/*tipo == 3) &&*/ trama==null)) {
			this.tipo=tipo;
			this.trama=trama;
			this.color=Objects.requireNonNull(color);
			
		} 
		else {
		this.tipo=Objects.requireNonNull(tipo);
		this.color=Objects.requireNonNull(color);
		this.trama=Objects.requireNonNull(trama);
	}
	}
	
	void insertarTipo(TipoMaterial tipo) {
		this.tipo=Objects.requireNonNull(tipo);
	}
	
	void insertarTrama(Trama trama){
		this.trama=Objects.requireNonNull(trama);
		
	}
	void insertarColor(Color color){
		this.color=Objects.requireNonNull(color);
	}
	
	
	
}


enum TipoPrenda{
	ZAPATO,
	CAMISA,
	PANTALON
}


enum TipoMaterial{
	LANA,
	CUERO,
	ALGODON,
	TELA
}
enum Color{
	ROJO,
	VERDE,
	AZUL
}
enum Trama{
	LISA,
	RAYADA,
	LUNARES,
	CUADROS,
	ESTAMPADO
}
// mi programa va a funcionar teniendo en cuenta de que al principio se debe instanciar un objeto TiposPrendaValidos que contenga
// una lista con los tipos de prenda validos, y otras 4 listas de los tipos ordenados por sus categorias.

class TiposPrendaValidos{
	
	List<TipoPrenda> prendasParteSuperior;
	List<TipoPrenda> prendasInferior;
	List<TipoPrenda> calzado;
	List<TipoPrenda> accesorios;

    ObtenerCondicionesClimaticas condicionesClimaticas

	 void TiposprendaParteSuperior(List<TipoPrenda> prendasParteSuperior){
		this.prendasParteSuperior=prendasParteSuperior;
	}
	 void TiposprendaParteInferior(List<TipoPrenda> prendasInferior){
		this.prendasInferior=prendasInferior;
	}
	 void TiposprendaCalzado(List<TipoPrenda> calzado){
		this.calzado=calzado;
	}
	 void TiposprendaAccesorio(List<TipoPrenda> accesorios){
			this.accesorios=accesorios;
		}
		
	 
	 public String NombreCategoriaSegun(TipoPrenda tipo) {
			if((prendasParteSuperior.contains(tipo))) {
				return "ParteSuperior";
			}
			if((prendasInferior.contains(tipo))) {
				return "ParteInferior";
			}
			if((calzado.contains(tipo))) {
				return "calzado";
			}
			
			else return "accesorio";
			}



        TipoPrenda obtenerParteInferiorSegunTemperatura(temperatura){
           return  prendasParteSuperior.filter(partSup=>partSup.seRecomiendoCon(temperatura)).get(0).(...)
        }
        TipoPrenda obtenerParteSuperiorSegunTemperatura(temperatura){
            return  prendasParteSuperior.filter(partSup=>partSup.seRecomiendoCon(temperatura)).get(0).(...)
        }
        TipoPrenda obtenerCalzadoSegunTemperatura(temperatura){
            return  prendasParteSuperior.filter(partSup=>partSup.seRecomiendoCon(temperatura)).get(0).(...)
        }
        TipoPrenda obtenerAccesorioSegunTemperatura(temperatura){
         return  prendasParteSuperior.filter(partSup=>partSup.seRecomiendoCon(temperatura)).get(0).(...)

        }
	
	
}



















 





