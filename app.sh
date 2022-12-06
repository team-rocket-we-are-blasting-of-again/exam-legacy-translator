#!/usr/bin/env bash

cmd=$1

case $cmd in
*start*)
    docker network create legacy_translator

    for docker_file in compose/*.docker-compose.yaml; do
        docker compose -f "$docker_file" up -d
    done
    ;;
*stop*)
    for docker_file in compose/*.docker-compose.yaml; do
        docker compose -f "$docker_file" down
    done

    docker network rm legacy_translator
    ;;
*)
    echo "no command was provided. Use either start or stop"
    exit 1
    ;;
esac


