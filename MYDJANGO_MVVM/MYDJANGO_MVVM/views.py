from django.shortcuts import render
from django.http.response import HttpResponse

def index(request):
    return render(request,'index.html')

def coo(request):
    return render(request, 'coo.html')

def ses_in(request):
    request.session.set_expiry(30) 
    request.session['e_id'] = '홍길동'
    return HttpResponse("SES_IN")

def ses_del(request):
    # del request.session['e_id']
    
    request.session.clear()
    return HttpResponse("SES_DEL")

def ses_view(request):
    e_id = request.session.get('e_id', '')
    return HttpResponse("SES_VIEW<br>" + str(e_id))

def coo_in(request):
    hr = HttpResponse("COO IN")
    # hr.set_cookie("e_id", ".홍길동".encode('utf-8'))
    hr.set_cookie("e_id", "hong kildong")
    return hr

def coo_del(request):
    hr = HttpResponse("COO DEL")
    hr.delete_cookie("e_id")
    return hr

def coo_view(request):
    e_id = request.COOKIES.get("e_id", "")
    # e_id = ""
    # try :
    #     e_id = request.COOKIES['e_id']
    # except :
    #     e_id = ""
    return HttpResponse("COO VIEW" + str(e_id))
