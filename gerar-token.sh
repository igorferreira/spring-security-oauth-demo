#!/bin/sh

# curl first-client:noonewilleverguess@localhost:8080/oauth/token -dgrant_type=client_credentials -dscope=any | jq '.'

access_token=$(curl -s first-client:noonewilleverguess@localhost:8080/oauth/token -dgrant_type=client_credentials -dscope=any | jq '.access_token' | sed -e 's/^"//' -e 's/"$//')

export access_token

echo ${access_token}
