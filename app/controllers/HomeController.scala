package controllers

import javax.inject._

import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.contoh())
  }

  /**
   * segitiga
   */

  def segitiga = Action {
    Ok(views.html.segitiga())
  }

  def luassegitiga = Action {
  Ok(views.html.luassegitiga(hitungluassegitiga = ""))
  }

  def kelilingsegitiga = Action {
  Ok(views.html.kelilingsegitiga(hitungkelilingsegitiga = ""))
  }

  def hitungluassegitiga(alas : String, tinggi : String) = Action {
  var hasil = alas.toInt * tinggi.toInt * 0.5
  Ok(views.html.luassegitiga(hitungluassegitiga = hasil.toString()))
  }

  def hitungkelilingsegitiga(nilaia : String, nilaib : String, nilaic : String) = Action {
  var hasil = nilaia.toInt + nilaib.toInt + nilaic.toInt
  Ok(views.html.kelilingsegitiga(hitungkelilingsegitiga = hasil.toString()))
  }

  /**
   * persegi
   */

  def persegi = Action {
  Ok(views.html.persegi())
  }

  def luaspersegi = Action {
  Ok(views.html.luaspersegi(hitungluaspersegi = ""))
  }

  def kelilingpersegi = Action {
  Ok(views.html.kelilingpersegi(hitungkelilingpersegi = ""))
  }

  def hitungluaspersegi(sisip : String) = Action {
  var hasil = sisip.toInt * sisip.toInt
  Ok(views.html.luaspersegi(hitungluaspersegi = hasil.toString()))
  }

  def hitungkelilingpersegi(sisip : String) = Action {
  var hasil = sisip.toInt * 4
  Ok(views.html.kelilingpersegi(hitungkelilingpersegi = hasil.toString()))
  }

  /**
  * lingkaran
  */

 def lingkaran = Action {
  Ok(views.html.lingkaran())
  }

  def luaslingkaran = Action {
  Ok(views.html.luaslingkaran(hitungluaslingkaran = ""))
  }

  def kelilinglingkaran = Action {
  Ok(views.html.kelilinglingkaran(hitungkelilinglingkaran = ""))
  }

  def hitungluaslingkaran(nilair : String) = Action {
  var hasil = nilair.toInt * nilair.toInt * 3.14
  Ok(views.html.luaslingkaran(hitungluaslingkaran = hasil.toString()))
  }

  def hitungkelilinglingkaran(nilair : String) = Action {
  var hasil = nilair.toInt * 2 * 3.14
  Ok(views.html.kelilinglingkaran(hitungkelilinglingkaran = hasil.toString()))
  }

  /**
  * persegipanjang
  */

  def persegipanjang = Action {
    Ok(views.html.persegipanjang(hitungluaspersegipanjang = "",hitungkelilingpersegipanjang = ""))
  }

  def luaspersegipanjang = Action {
  Ok(views.html.luaspersegipanjang(hitungluaspersegipanjang = ""))
  }

  def kelilingpersegipanjang = Action {
  Ok(views.html.kelilingpersegipanjang(hitungkelilingpersegipanjang = ""))
  }
  def hitungluaspersegipanjang(panjang : String, lebar : String) = Action {
  var hasil = panjang.toInt * lebar.toInt
  Ok(views.html.luaspersegipanjang(hitungluaspersegipanjang = hasil.toString()))
  }

  def hitungkelilingpersegipanjang(panjang : String,lebar : String) = Action {
  var hasil = (panjang.toInt + lebar.toInt) * 2
  Ok(views.html.kelilingpersegipanjang(hitungkelilingpersegipanjang = hasil.toString()))
  }

}