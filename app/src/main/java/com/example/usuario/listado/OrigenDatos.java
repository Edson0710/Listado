package com.example.usuario.listado;

import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Usuario on 24/04/2018.
 */

public class OrigenDatos {
    public ArrayList<Tarjeta> getDatos(){
        ArrayList<Tarjeta> datos = new ArrayList<Tarjeta>();

        Tarjeta uno = new Tarjeta();
        uno.setNombre("Edson Daniel Navarro");
        uno.setEdad(18);
        uno.setDescripcion("Estudiante en Desarrollo de Software");
        uno.setImagen(0);
        datos.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.setNombre("Ivan Alejandro");
        dos.setEdad(18);
        dos.setDescripcion("Le gusta el Benites y el alcohol barato");
        dos.setImagen(0);
        datos.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.setNombre("Palomino");
        tres.setEdad(18);
        tres.setDescripcion("3 palabras: SE LA COME");
        tres.setImagen(0);
        datos.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.setNombre("Erick Benites");
        cuatro.setEdad(18);
        cuatro.setDescripcion("Le va al Atklas, anda con Ivan y es el chavo del Nacho");
        cuatro.setImagen(0);
        datos.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.setNombre("Nacho Robles");
        cinco.setEdad(17);
        cinco.setDescripcion("No se llama Nacho, es el jefe de Benites");
        cinco.setImagen(0);
        datos.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.setNombre("Andres Manuel Lopez Obrador");
        seis.setEdad(60);
        seis.setDescripcion("No supo como defenderse en el debate");
        seis.setImagen(0);
        datos.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.setNombre("EL Bronco");
        siete.setEdad(50);
        siete.setDescripcion("Quiere mocharle las manos a los rateros y es mentiroso");
        siete.setImagen(0);
        datos.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.setNombre("Margarita Zavala");
        ocho.setEdad(47);
        ocho.setDescripcion("Esta tarjeta va para ti mujer, para ti doctora y para los ingenieros del mundo");
        ocho.setImagen(0);
        datos.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.setNombre("Jose Antonio Meade");
        nueve.setEdad(39);
        nueve.setDescripcion("Yo soy Jose Antonio Meade");
        nueve.setImagen(0);
        datos.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.setNombre("Ricardo Anaya");
        diez.setEdad(40);
        diez.setDescripcion("Ahi es donde te equivocas Andrés Manuel :v");
        diez.setImagen(0);
        datos.add(diez);

        return datos;
    }

    public ArrayList<String> getImagen() {
        ArrayList<String> Image = new ArrayList<String>();

        Image.add("http://e.rpp-noticias.io/normal/2018/04/09/455845_591387.jpg");

        Image.add("https://www.elintransigente.com/u/fotografias/m/2018/2/26/f999x666-445163_540228_0.jpg");

        Image.add("http://www.raicesspanish.com/wp-content/uploads/2017/08/Paloma.jpg");

        Image.add("https://besthqwallpapers.com/Uploads/24-10-2017/25381/thumb2-atlas-fc-4k-mexican-football-club-emblem-atlas-logo.jpg");

        Image.add("https://www.divinacocina.es/wp-content/uploads/nachos-con-salsa-queso.jpg");

        Image.add("https://www.debate.com.mx/__export/1524053259125/sites/debate/img/2018/04/18/amlo-amenaza-tigre_jpg_539665225.jpg_539665225.jpg");

        Image.add("https://cdn.proceso.com.mx/media/2018/04/f092781ae2a5b28972-180307_bronco_8_gc-c-1078x799.jpg");

        Image.add("https://i0.wp.com/noticieros.televisa.com/wp-content/uploads/2017/10/margarita.jpg?resize=798%2C602&quality=100&ssl=1");

        Image.add("https://pbs.twimg.com/profile_images/979597895111294976/CAsjaezd.jpg");

        Image.add("https://i.ytimg.com/vi/lr1vBnZ15rc/maxresdefault.jpg");

        return Image;

    }

}
