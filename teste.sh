#!/bin/sh

curl -s -H "Authorization: bearer ${access_token}" http://localhost:8080/teste | jq '.'