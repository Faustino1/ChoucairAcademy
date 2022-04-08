#Autor: Faustino Aragon
  @stories
  Feature: Registro de ususario en Utest
    @Scenario1
    Scenario: Registro de Faustino en Utest
      Given Faustino desea registrarse en Utest
      When El usuario ingresa los datos requeridos el sistema
      | strNombre |strApellido | strEmail           | strMesNacimiento | strDiaNaimiento | strAnioNaccimiento | strCiudad | strPostal | strPais |strDispositivoMovil|strModelo|strSistemaOperativo|strClave|

     | Faustino   |Aragon     | faragonv1@gmail.com | Marzo            | 25              | 1999               | Bogota    | 111941    | Colomia | Xiaomi            | Redmi 10 | Android 10       |olombia2022|

      Then El registro se completa al ver el boton de Complete Setup
        |strTextoF|
        |Completa Setup|