//APLICANDO HERENCIA EN PHP







<?php
class UberX extends Car{ //EN PHP PARA APLICAR HERENCIA ES LA MISMA SINTASIS QUE JAVA
public $color;
public $model;

public function __construct($driver,$license,$color,$model){ //CONSTRUCTOR EN PHP
    parent::_construct($license,$driver);
    $this->driver;
    $this->license;
}

}
?>