open class Persona(var nombre:String,var apellido:String,var numeroIdentificacion:Int,var estadoCivil:String) {

    open fun cambioEstadoCivil(estadoCivil2: String):String{
        estadoCivil=estadoCivil2
        return "Cambio de estado civil realizado"
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', numeroIdentificacion=$numeroIdentificacion, estadoCivil='$estadoCivil')"
    }


}