class Profesor(nombre:String,apellido:String,numeroIdentificacion:Int,estadoCivil:String
               ,anioIngreso:String,numeroDespacho:Int, var departamento:String):Empleado(nombre,apellido,numeroIdentificacion,estadoCivil,anioIngreso, numeroDespacho) {

    fun cambioDepartamento(departamento2: String):String{
        departamento=departamento2
        return "departamento cambiado"
    }

    override fun toString(): String {
        return super.toString()+" Profesor(departamento='$departamento')"
    }


}