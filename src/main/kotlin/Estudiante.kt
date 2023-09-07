class Estudiante(nombre:String,apellido:String,numeroIdentificacion:Int,estadoCivil:String, var curso:String)
    :Persona(nombre,apellido,numeroIdentificacion,estadoCivil) {
    fun inscripcionDeCurso(curso2: String):String{
        curso=curso2
        return "Matriculado a nuevo curso"
    }

    override fun toString(): String {
        return super.toString()+" Estudiante(curso='$curso')"
    }


}