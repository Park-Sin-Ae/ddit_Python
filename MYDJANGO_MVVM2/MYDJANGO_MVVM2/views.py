from django.shortcuts import redirect
from django.views.decorators.csrf import csrf_exempt
from django.http.response import JsonResponse
import json
from MYDJANGO_MVVM2.daoemp import DaoEmp

def main(request):
    return redirect('/static/ajax.html')

@csrf_exempt
def ajax(request):
    print(request)
    data = json.loads(request.body)
    print(data['menu'])
    context = {
        'result': data,
    }
    return JsonResponse(context)

@csrf_exempt
def fetch(request):
    data = json.loads(request.body)
    print(data['menu'])
    context = {
        'message': 'hi'
    }
    return JsonResponse(context)

@csrf_exempt
def ajax_emp_list(request):
    de = DaoEmp()
    list = de.selectList()
    context = {
        'list' : list,
    }
    return JsonResponse(context)

@csrf_exempt
def ajax_emp_one(request):
    param = json.loads(request.body)
    e_id = param['e_id']
    
    de = DaoEmp()
    vo = de.selectOne(e_id)
    context = {
        'vo': vo
    }
    return JsonResponse(context)


@csrf_exempt
def ajax_emp_add(request):
    param = json.loads(request.body)
    e_id = param['e_id']
    e_name = param['e_name']
    gen = param['gen']
    addr = param['addr']
    
    de = DaoEmp()
    cnt = de.insert(e_id, e_name, gen, addr)
    context = {
        'cnt': cnt
    }
    return JsonResponse(context)


@csrf_exempt
def ajax_emp_mod(request):
    param = json.loads(request.body)
    e_id = param['e_id']
    e_name = param['e_name']
    gen = param['gen']
    addr = param['addr']
    
    de = DaoEmp()
    cnt = de.update(e_id, e_name, gen, addr)
    context = {
        'cnt': cnt
    }
    return JsonResponse(context)

@csrf_exempt
def ajax_emp_del(request):
    param = json.loads(request.body)
    e_id = param['e_id']
    
    de = DaoEmp()
    cnt = de.delete(e_id)
    context = {
        'cnt': cnt
    }
    return JsonResponse(context)