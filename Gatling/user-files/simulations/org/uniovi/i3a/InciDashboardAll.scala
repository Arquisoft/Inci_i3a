
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PruebaInciDesdeUniovi extends Simulation {

	val httpProtocol = http
		.baseURL("http://asw-i3a-operators-client.guill.io")
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Origin" -> "http://asw-i3a-operators-client.guill.io",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_1 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_2 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"referer" -> "http://asw-i3a-operators-client.guill.io/incidents",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_4 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_5 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"cookie" -> "__cfduid=dddecf3026694068b308744772e8903e91525087842",
		"referer" -> "http://asw-i3a-operators-client.guill.io/incidents",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_8 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_9 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"Connection" -> "keep-alive",
		"Origin" -> "http://asw-i3a-operators-client.guill.io",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_10 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_19 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"referer" -> "http://asw-i3a-operators-client.guill.io/incident/details/5ae9f80e18995700017ea1d8",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_24 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"X-DevTools-Emulate-Network-Conditions-Client-Id" -> "CCA74EA454CA4CE39D5530AF0C8A6455")

	val headers_98 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"Connection" -> "keep-alive",
		"Origin" -> "http://asw-i3a-operators-client.guill.io",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

	val headers_102 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"referer" -> "http://asw-i3a-operators-client.guill.io/agent/sensorDetails/5ad12d5d71b7a726c78124c5",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_104 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"cookie" -> "NID=128=WkC5DTRqkoVj5ShxJt-fuzMj2GYZubakt9PgG7H1Ijs38uc1q-runSGEidesZ_WCri_F1LYUXNqi38dAC3WgtJKjOUg7d28q-8BKySA_iHH9PYzi0QxX-QmUZNkR3-5p; CONSENT=WP.26c5c9",
		"referer" -> "http://asw-i3a-operators-client.guill.io/agent/sensorDetails/5ad12d5d71b7a726c78124c5",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_107 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"referer" -> "http://asw-i3a-operators-client.guill.io/agent/sensorDetails/5ad12d5d71b7a726c78124c5",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_143 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"referer" -> "http://asw-i3a-operators-client.guill.io/agent/sensorDetails/5ad12d5d71b7a726c78124c5",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_151 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "es-ES,es;q=0.9,en;q=0.8,ro;q=0.7",
		"origin" -> "http://asw-i3a-operators-client.guill.io",
		"referer" -> "https://fonts.googleapis.com/css?family=Roboto:300,400,500,700",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
		"x-client-data" -> "CIS2yQEIorbJAQjBtskBCKmdygEIqKPKAQ==")

	val headers_156 = Map(
		"Origin" -> "http://asw-i3a-operators-client.guill.io",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")

    val uri01 = "https://khms0.googleapis.com/kh"
    val uri02 = "https://code.highcharts.com"
    val uri03 = "https://maps.googleapis.com"
    val uri04 = "https://ajax.googleapis.com/ajax/libs/jquery"
    val uri05 = "https://khms1.googleapis.com/kh"
    val uri06 = "https://code.jquery.com/jquery-3.1.1.min.js"
    val uri07 = "https://npmcdn.com/tether@1.2.4/dist/js/tether.min.js"
    val uri09 = "http://asw-i3a-zuul-eu-west-1.guill.io/sensor_data_mining_service/sensor/5ad12d5d71b7a726c78124c5"
    val uri10 = "https://maps.gstatic.com/mapfiles"
    val uri11 = "https://fonts.gstatic.com/s/roboto/v18"
    val uri12 = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7"
    val uri13 = "https://fonts.googleapis.com/css"

	val scn = scenario("PruebaInciDesdeUniovi")
		.exec(http("request_0")
			.post("/login")
			.headers(headers_0)
			.formParam("login", "elena@dlp.com")
			.formParam("password", "1234")
			.formParam("Enter", "enter")
			.resources(http("request_1")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_2")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_3")
			.get(uri12 + "/js/bootstrap.min.js")
			.headers(headers_1),
            http("request_4")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_5")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_6")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_7")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_8")
			.get("/style.css")
			.headers(headers_8),
            http("request_9")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))
		.pause(2)
		.exec(http("request_10")
			.get("/incident/details/5ae9f80e18995700017ea1d8")
			.headers(headers_10)
			.resources(http("request_11")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_12")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_13")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_14")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_15")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_16")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_17")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_18")
			.get("/style.css")
			.headers(headers_1),
            http("request_19")
			.get(uri03 + "/maps/api/js?key=AIzaSyCC-BZDN5YUHWapbhMk2xwValmvBx8meFs&callback=initMap")
			.headers(headers_19),
            http("request_20")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9),
            http("request_21")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/common.js")
			.headers(headers_19),
            http("request_22")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/util.js")
			.headers(headers_19),
            http("request_23")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/infowindow.js")
			.headers(headers_19)))
		.pause(2)
		.exec(http("request_24")
			.get("/incidents")
			.headers(headers_24)
			.resources(http("request_25")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_26")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_27")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_28")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_29")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_30")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_31")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_32")
			.get("/style.css")
			.headers(headers_1),
            http("request_33")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))
		.pause(1)
		.exec(http("request_34")
			.get("/incident/edit/5ae9f80e18995700017ea1d8")
			.headers(headers_10)
			.resources(http("request_35")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_36")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_37")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_38")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_39")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_40")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_41")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_42")
			.get("/style.css")
			.headers(headers_1),
            http("request_43")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))
		.pause(1)
		.exec(http("request_44")
			.post("/incident/edit/5ae9f80e18995700017ea1d8")
			.headers(headers_0)
			.formParam("status", "OPEN")
			.formParam("comment", "Esto es un comentario")
			.resources(http("request_45")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_46")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_47")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_48")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_49")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_50")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_51")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_52")
			.get("/style.css")
			.headers(headers_1),
            http("request_53")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))
		.pause(5)
		.exec(http("request_54")
			.get("/operator/listMyIncidents")
			.headers(headers_10)
			.resources(http("request_55")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_56")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_57")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_58")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_59")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_60")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_61")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_62")
			.get("/style.css")
			.headers(headers_1),
            http("request_63")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))
		.pause(8)
		.exec(http("request_64")
			.get("/incident/details/5ae87d6a18995700017ea1d7")
			.headers(headers_10)
			.resources(http("request_65")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_66")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_67")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_68")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_69")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_70")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_71")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_72")
			.get("/style.css")
			.headers(headers_1),
            http("request_73")
			.get(uri03 + "/maps/api/js?key=AIzaSyCC-BZDN5YUHWapbhMk2xwValmvBx8meFs&callback=initMap")
			.headers(headers_1),
            http("request_74")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9),
            http("request_75")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/common.js")
			.headers(headers_1),
            http("request_76")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/util.js")
			.headers(headers_1),
            http("request_77")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/infowindow.js")
			.headers(headers_1)))
		.pause(2)
		.exec(http("request_78")
			.get("/agent/listSensors")
			.headers(headers_10))
		.pause(1)
		.exec(http("request_79")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1)
			.resources(http("request_80")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_81")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_82")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_83")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_84")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_85")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_86")
			.get("/style.css")
			.headers(headers_1),
            http("request_87")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))
		.pause(3)
		.exec(http("request_88")
			.get("/agent/sensorDetails/5ad12d5d71b7a726c78124c5")
			.headers(headers_10)
			.resources(http("request_89")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_1),
            http("request_90")
			.get(uri04 + "/3.2.0/jquery.min.js")
			.headers(headers_2),
            http("request_91")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_92")
			.get(uri06 + "")
			.headers(headers_4),
            http("request_93")
			.get(uri02 + "/highcharts.js")
			.headers(headers_5),
            http("request_94")
			.get(uri02 + "/modules/exporting.js")
			.headers(headers_5),
            http("request_95")
			.get(uri02 + "/modules/export-data.js")
			.headers(headers_5),
            http("request_96")
			.get("/style.css")
			.headers(headers_1),
            http("request_97")
			.get(uri03 + "/maps/api/js?key=AIzaSyCC-BZDN5YUHWapbhMk2xwValmvBx8meFs&callback=initMap")
			.headers(headers_1),
            http("request_98")
			.get(uri09 + "")
			.headers(headers_98),
            http("request_99")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9),
            http("request_100")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/common.js")
			.headers(headers_1),
            http("request_101")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/util.js")
			.headers(headers_1),
            http("request_102")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/map.js")
			.headers(headers_102),
            http("request_103")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/marker.js")
			.headers(headers_102),
            http("request_104")
			.get(uri10 + "/openhand_8_8.cur")
			.headers(headers_104),
            http("request_105")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/onion.js")
			.headers(headers_102),
            http("request_106")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/infowindow.js")
			.headers(headers_1),
            http("request_107")
			.get(uri05 + "?v=798&hl=es-ES&x=15841&y=11968&z=15")
			.headers(headers_107),
            http("request_108")
			.get(uri01 + "?v=798&hl=es-ES&x=15840&y=11968&z=15")
			.headers(headers_107),
            http("request_109")
			.get(uri01 + "?v=798&hl=es-ES&x=15840&y=11967&z=15")
			.headers(headers_107),
            http("request_110")
			.get(uri05 + "?v=798&hl=es-ES&x=15841&y=11967&z=15")
			.headers(headers_107),
            http("request_111")
			.get(uri01 + "?v=798&hl=es-ES&x=15842&y=11967&z=15")
			.headers(headers_107),
            http("request_112")
			.get(uri01 + "?v=798&hl=es-ES&x=15842&y=11968&z=15")
			.headers(headers_107),
            http("request_113")
			.get(uri01 + "?v=798&hl=es-ES&x=15842&y=11969&z=15")
			.headers(headers_107),
            http("request_114")
			.get(uri05 + "?v=798&hl=es-ES&x=15841&y=11969&z=15")
			.headers(headers_107),
            http("request_115")
			.get(uri01 + "?v=798&hl=es-ES&x=15840&y=11969&z=15")
			.headers(headers_107),
            http("request_116")
			.get(uri05 + "?v=798&hl=es-ES&x=15839&y=11969&z=15")
			.headers(headers_107),
            http("request_117")
			.get(uri05 + "?v=798&hl=es-ES&x=15839&y=11968&z=15")
			.headers(headers_107),
            http("request_118")
			.get(uri05 + "?v=798&hl=es-ES&x=15839&y=11967&z=15")
			.headers(headers_107),
            http("request_119")
			.get(uri05 + "?v=798&hl=es-ES&x=15843&y=11967&z=15")
			.headers(headers_107),
            http("request_120")
			.get(uri05 + "?v=798&hl=es-ES&x=15843&y=11968&z=15")
			.headers(headers_107),
            http("request_121")
			.get(uri05 + "?v=798&hl=es-ES&x=15843&y=11969&z=15")
			.headers(headers_107),
            http("request_122")
			.get(uri03 + "/maps/api/js/ViewportInfoService.GetViewportInfo?1m6&1m2&1d43.5518624019154&2d-6.039369839785877&2m2&1d43.600052997805584&2d-5.882361769304907&2u15&4ses-ES&5e3&6sm%40420000000&7b0&8e0&callback=_xdc_._hula7p&token=30419")
			.headers(headers_102),
            http("request_123")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15841!3i11968!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=86090")
			.headers(headers_107),
            http("request_124")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15840!3i11968!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=17786")
			.headers(headers_107),
            http("request_125")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15840!3i11967!4i256!2m3!1e0!2sm!3i420120632!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=130466")
			.headers(headers_107),
            http("request_126")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15841!3i11967!4i256!2m3!1e0!2sm!3i420120632!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=67699")
			.headers(headers_107),
            http("request_127")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15842!3i11967!4i256!2m3!1e0!2sm!3i420120632!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=4932")
			.headers(headers_107),
            http("request_128")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15842!3i11968!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=23323")
			.headers(headers_107),
            http("request_129")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15842!3i11969!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=105061")
			.headers(headers_107),
            http("request_130")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15841!3i11969!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=36757")
			.headers(headers_107),
            http("request_131")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15840!3i11969!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=99524")
			.headers(headers_107),
            http("request_132")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15839!3i11969!4i256!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=56260")
			.headers(headers_107),
            http("request_133")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15839!3i11968!4i256!2m3!1e0!2sm!3i420120632!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=37869")
			.headers(headers_107),
            http("request_134")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15839!3i11967!4i256!2m3!1e0!2sm!3i420119516!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=98485")
			.headers(headers_107),
            http("request_135")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15843!3i11967!4i256!2m3!1e0!2sm!3i420120632!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=73236")
			.headers(headers_107),
            http("request_136")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15843!3i11968!4i256!2m3!1e0!2sm!3i420120693!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=82670")
			.headers(headers_107),
            http("request_137")
			.get(uri03 + "/maps/vt?pb=!1m5!1m4!1i15!2i15843!3i11969!4i256!2m3!1e0!2sm!3i420120693!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e0!5m1!5f2!23i1301875&token=33337")
			.headers(headers_107),
            http("request_138")
			.get(uri10 + "/transparent.png")
			.headers(headers_104),
            http("request_139")
			.get(uri10 + "/api-3/images/spotlight-poi2_hdpi.png")
			.headers(headers_104),
            http("request_140")
			.get(uri03 + "/maps/vt?pb=!1m4!1m3!1i15!2i15839!3i11967!1m4!1m3!1i15!2i15840!3i11967!1m4!1m3!1i15!2i15841!3i11967!1m4!1m3!1i15!2i15842!3i11967!1m4!1m3!1i15!2i15843!3i11967!1m4!1m3!1i15!2i15839!3i11968!1m4!1m3!1i15!2i15839!3i11969!1m4!1m3!1i15!2i15840!3i11968!1m4!1m3!1i15!2i15840!3i11969!1m4!1m3!1i15!2i15841!3i11968!1m4!1m3!1i15!2i15841!3i11969!1m4!1m3!1i15!2i15842!3i11968!1m4!1m3!1i15!2i15842!3i11969!1m4!1m3!1i15!2i15843!3i11968!1m4!1m3!1i15!2i15843!3i11969!2m3!1e0!2sm!3i420120848!3m12!2ses-ES!3sUS!5e18!12m4!1e68!2m2!1sset!2sRoadmapSatellite!12m3!1e37!2m1!1ssmartmaps!4e3!12m1!5b1!23i1301875&callback=_xdc_._ijubz9&token=15102")
			.headers(headers_102),
            http("request_141")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/controls.js")
			.headers(headers_102),
            http("request_142")
			.get(uri03 + "/maps/api/js/AuthenticationService.Authenticate?1shttp%3A%2F%2Fasw-i3a-operators-client.guill.io%2Fagent%2FsensorDetails%2F5ad12d5d71b7a726c78124c5&4sAIzaSyCC-BZDN5YUHWapbhMk2xwValmvBx8meFs&callback=_xdc_._j05szq&token=43248")
			.headers(headers_102),
            http("request_143")
			.get(uri13 + "?family=Roboto:300,400,500,700")
			.headers(headers_143),
            http("request_144")
			.get(uri10 + "/api-3/images/google_white5_hdpi.png")
			.headers(headers_104),
            http("request_145")
			.get(uri10 + "/api-3/images/mapcnt6.png")
			.headers(headers_104),
            http("request_146")
			.get(uri10 + "/api-3/images/sv9.png")
			.headers(headers_104),
            http("request_147")
			.get(uri10 + "/api-3/images/tmapctrl_hdpi.png")
			.headers(headers_104),
            http("request_148")
			.get(uri10 + "/api-3/images/cb_scout5_hdpi.png")
			.headers(headers_104),
            http("request_149")
			.get(uri10 + "/api-3/images/tmapctrl4_hdpi.png")
			.headers(headers_104),
            http("request_150")
			.get(uri10 + "/mv/imgs8.png")
			.headers(headers_104),
            http("request_151")
			.get(uri11 + "/KFOmCnqEu92Fr1Mu4mxK.woff2")
			.headers(headers_151),
            http("request_152")
			.get(uri11 + "/KFOlCnqEu92Fr1MmEU9fBBc4.woff2")
			.headers(headers_151)))
		.pause(3)
		.exec(http("request_153")
			.get(uri03 + "/maps-api-v3/api/js/32/13/intl/es_ALL/stats.js")
			.headers(headers_102))
		.pause(1)
		.exec(http("request_154")
			.get(uri03 + "/maps/api/js/QuotaService.RecordEvent?1shttp%3A%2F%2Fasw-i3a-operators-client.guill.io%2Fagent%2FsensorDetails%2F5ad12d5d71b7a726c78124c5&3sAIzaSyCC-BZDN5YUHWapbhMk2xwValmvBx8meFs&7sq7bccd&10e1&callback=_xdc_._kffngg&token=16920")
			.headers(headers_102)
			.resources(http("request_155")
			.get("/logout")
			.headers(headers_10),
            http("request_156")
			.get(uri12 + "/css/bootstrap.min.css")
			.headers(headers_156),
            http("request_157")
			.get(uri12 + "/js/bootstrap.min.js"),
            http("request_158")
			.get(uri04 + "/3.1.1/jquery.min.js")
			.headers(headers_1),
            http("request_159")
			.get(uri07 + "")
			.headers(headers_1),
            http("request_160")
			.get("/signin.css")
			.headers(headers_1),
            http("request_161")
			.get("/img/inci-dash-logo.png")
			.headers(headers_1),
            http("request_162")
			.get(uri12 + "/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_9)))

	setUp(scn.inject(atOnceUsers(1000))).protocols(httpProtocol)
}