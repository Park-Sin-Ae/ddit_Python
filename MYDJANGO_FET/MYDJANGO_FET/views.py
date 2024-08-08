from django.shortcuts import redirect
from MYDJANGO_FET.daoemp import DaoEmp
from django.views.decorators.csrf import csrf_exempt
from django.http.response import JsonResponse

def main(request):
    return redirect('/static/emp.html')


@csrf_exempt
def ajax_emp_list(request):
    de = DaoEmp()
    list = de.selectList()
    context = {
        'list' : list,
    }
    return JsonResponse(context)