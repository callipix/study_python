import json

from django.http import HttpResponse
from django.http.response import JsonResponse
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt

def index(request):
    return HttpResponse("Hello, Django!")

def emp(request):
    return HttpResponse("emp.html")

@csrf_exempt
def ajax(request):
#    menu = request.POST["menu"]
#    print("menu",menu)
    data = json.loads(request.body)
    print(data['menu'])
    return JsonResponse({'result':'success'})

@csrf_exempt
def axios(request):
    data = json.loads(request.body)
    print(data['menu'])
    return JsonResponse({'result':'success'})

@csrf_exempt
def fetch(request):
    data = json.loads(request.body)
    print(data['menu'])
    return JsonResponse({'result':'success'})
