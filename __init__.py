#!/usr/bin/env python
import sys

from suds.client import Client

url = "http://localhost:7777/ws/SoapData?wsdl"
client = Client(url)
a= 0
while a==0:
    username = raw_input('Usuario: ')
    password = raw_input('Password: ')
    user=client.service.getPostsUsuario(username,password)
    if(user is None):
        print "User o pass equivocado."
        print ""
        a=0
    else:
        a=1
        print user
        print "Crear Post"
        text = raw_input('Texto: ')
        post=client.service.crearPost(username,text)
        print post
        print "\n"

        sys.exit()
