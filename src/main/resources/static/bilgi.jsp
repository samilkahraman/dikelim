<%@ page pageEncoding="UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

<div class="portlet light bordered">
    <div class="portlet-title">
        <div class="caption">
            <i class="icon-settings font-dark"></i>
            <span class="caption-subject font-dark sbold uppercase">Ağaç Dikim Bilgileri</span>
        </div>

    </div>
    <div class="portlet-body form">
        <form class="form-horizontal" role="form">
            <div class="form-body">
                <div class="form-group">
                    <label class="col-md-3 control-label">İsim</label>
                    <div class="col-md-9">
                        <input type="text" class="form-control" placeholder="Enter text">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-3 control-label">Soy İsim</label>
                    <div class="col-md-9">
                        <input type="text" class="form-control" placeholder="Enter text">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-3 control-label">Doğum Yılınız</label>
                    <div class="col-md-9">
                        <select class="form-control">
                            <option>1996</option>
                            <option>1996</option>
                            <option>1996</option>
                            <option>1996</option>
                            <option>1996</option>
                        </select>
                    </div>
                </div>

            </div>
            <div class="form-actions">
                <div class="row">
                    <div class="col-md-offset-3 col-md-9">
                        <button type="submit" class="btn green">Submit</button>
                        <button type="button" class="btn default">Cancel</button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src=""></script>
</body>
</html>
