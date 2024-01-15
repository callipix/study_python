import json

from django.http import HttpResponse
from django.http.response import JsonResponse
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt

def index(request):
    return HttpResponse("Hello, Django!")

@csrf_exempt
def ajax(request):
#    menu = request.POST["menu"]
#    print("menu",menu)
    data = json.loads(request.body)
    print(data['menu'])
    return JsonResponse({'result':'success'})

@csrf_exempt
def select_list(request):
    list = [
        {'e_id':1,'e_name':1,'gen':1,'addr':1},
        {'e_id':2,'e_name':2,'gen':2,'addr':2}
        ]
    return JsonResponse({'list':list})