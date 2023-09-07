class Libreta (var sisben:Int=0,var edad:Int) {

    fun calcularCosto():Double{
        var costo:Double=0.0
        var descuento:Int=0
        if(edad>18){
            costo=350000.00
            if (sisben==1){
                descuento=40
            }else if (sisben==2){
                descuento=30
            }else if (sisben==3){
                descuento=15
            }else{
                descuento=0
            }
        }
        if(edad==18){
            costo=200000.00
            if (sisben==1){
                descuento=60
            }else if (sisben==2){
                descuento=40
            }else if (sisben==3){
                descuento=20
            }else{
                descuento=0
            }
        }
        costo-=(costo*descuento)/100
        return costo
    }

}