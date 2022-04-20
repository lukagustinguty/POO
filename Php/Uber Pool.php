<?php
class UberPool extends Car{

    public $color;
    public $modelo;


    public function __construct($driver,$license,$color,$model){ //CONSTRUCTOR EN PHP
        parent::_construct($license,$driver);// HACE REFERENCIA A "SUPER" LO QUE PONEMOS EN JAVA
        $this->driver;
        $this->license;
    }

}

?>php