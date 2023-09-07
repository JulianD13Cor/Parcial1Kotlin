open class Empleado (nombre:String, apellido:String, numeroIdentificacion:Int, estadoCivil:String, var aniooIngreso:String, var numeroDespacho:Int)
    :Persona(nombre,apellido,numeroIdentificacion,estadoCivil) {

    open fun reasignacionDespacho(numeroDespacho2: Int):String{
        numeroDespacho=numeroDespacho2
        return "Despacho cambiado"
    }

    override fun toString(): String {
        return super.toString()+" Empleado(aniooIngreso='$aniooIngreso', numeroDespacho=$numeroDespacho)"
    }

}