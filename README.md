# netflix-zuul-api-gateway-server
A spring cloud project that is basically a Zuul API gateway to intercept the REST calls happening between micro services. 

URL:

The common url for intercepting any call through Zuul is :     
  http://localhost:8765/{app-name_as_registered_in_Eureka}/{url_which_is_to_be_intercepted}
