package modelo;

public class SeguroCoche extends Poliza {

	
		
		protected String matricula;
		protected int anyoCarnet;
		
		public SeguroCoche(String matricula, int anyoCarnet) {
			super();
			this.matricula = matricula;
			this.anyoCarnet = anyoCarnet;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public int getAnyoCarnet() {
			return anyoCarnet;
		}

		public void setAnyoCarnet(int anyoCarnet) {
			this.anyoCarnet = anyoCarnet;
		}

		@Override
		public String toString() {
			return "SeguroCoche [matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + ", idPoliza=" + idPoliza
					+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", anyo=" + anyo
					+ ", formaPago=" + formaPago + ", primaBase=" + primaBase + ", numSiniestroHistorico="
					+ numSiniestroHistorico + "]";
		}

		@Override
		public double calculaPrima() {
			
		}
	}


	


