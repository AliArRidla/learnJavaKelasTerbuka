@extends('layouts.app')
@section('content')
    <div class="container">
        <form class="login" method="POST" action="/update">
            @csrf
            <div class="form-group">
                <label for="title">Judul</label>
                <input type="text" name="title" class="form-control" id="title" value="{{$article -> title}}">
            </div>
            <div class="form-group">
                <label for="author">Author</label>
                <input type="text" name="author" class="form-control" id="author" value="{{$article -> author}}">
            </div>
            <div class="form-group">
                <label for="body">Body</label>
                <textarea class="form-control" name="body" id="body" rows="6">{{$article -> body}}</textarea>
            </div>
            <button type="submit" class="btn btn-success btn-lg btn-block">Create</button>
        </form>
    </div>
@endsection